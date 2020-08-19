/*
 * Copyright 2013-2020 consulo.io
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package consulo.database.datasource.jdbc.ui;

import com.intellij.ide.util.treeView.AbstractTreeNode;
import com.intellij.openapi.project.Project;
import consulo.database.datasource.configurable.GenericPropertyKeys;
import consulo.database.datasource.jdbc.provider.impl.JdbcDatabaseState;
import consulo.database.datasource.jdbc.provider.impl.JdbcState;
import consulo.database.datasource.jdbc.ui.tree.DatabaseJdbcDatabaseNode;
import consulo.database.datasource.jdbc.ui.tree.DatabaseKnownJdbcDatabaseNode;
import consulo.database.datasource.model.DataSource;
import consulo.database.datasource.transport.DataSourceTransportManager;
import consulo.database.datasource.ui.DataSourceTreeNodeProvider;
import consulo.util.lang.StringUtil;

import javax.annotation.Nonnull;
import java.util.function.Consumer;

/**
 * @author VISTALL
 * @since 2020-08-18
 */
public class JdbcDataSourceTreeNodeProvider implements DataSourceTreeNodeProvider
{
	@Override
	public void fillTreeNodes(@Nonnull Project project, @Nonnull DataSource dataSource, @Nonnull Consumer<AbstractTreeNode<?>> consumer)
	{
		String dbName = dataSource.getProperties().get(GenericPropertyKeys.DATABASE_NAME);
		if(!StringUtil.isEmpty(dbName))
		{
			consumer.accept(new DatabaseKnownJdbcDatabaseNode(project, dataSource, dbName));
		}
		else
		{
			JdbcState state = DataSourceTransportManager.getInstance(project).getDataState(dataSource);

			if(state == null)
			{
				return;
			}

			for(JdbcDatabaseState databaseState : state.getDatabases().values())
			{
				consumer.accept(new DatabaseJdbcDatabaseNode(project, dataSource, databaseState));
			}
		}
	}
}
