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

package consulo.database.postgresql.node;

import com.intellij.openapi.project.Project;
import consulo.database.datasource.jdbc.provider.impl.JdbcDatabaseState;
import consulo.database.datasource.jdbc.ui.tree.DatabaseJdbcTablesNode;
import consulo.database.datasource.model.DataSource;

/**
 * @author VISTALL
 * @since 2020-08-30
 */
public class PostgresqlTablesNode extends DatabaseJdbcTablesNode
{
	public PostgresqlTablesNode(Project project, DataSource dataSource, JdbcDatabaseState jdbcDatabaseState)
	{
		super(project, dataSource, jdbcDatabaseState);
	}
}