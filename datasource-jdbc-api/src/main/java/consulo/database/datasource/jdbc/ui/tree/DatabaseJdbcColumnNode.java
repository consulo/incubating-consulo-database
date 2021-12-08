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

package consulo.database.datasource.jdbc.ui.tree;

import com.intellij.ide.projectView.PresentationData;
import com.intellij.ide.util.treeView.AbstractTreeNode;
import com.intellij.openapi.project.Project;
import com.intellij.ui.SimpleTextAttributes;
import consulo.annotation.access.RequiredReadAction;
import consulo.database.datasource.jdbc.provider.impl.JdbcPrimaryKeyState;
import consulo.database.datasource.jdbc.provider.impl.JdbcTableColumState;
import consulo.database.datasource.jdbc.provider.impl.JdbcTableState;
import consulo.database.icon.DatabaseIconGroup;
import consulo.ui.image.ImageKey;

import javax.annotation.Nonnull;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * @author VISTALL
 * @since 2020-08-19
 */
public class DatabaseJdbcColumnNode extends AbstractTreeNode<JdbcTableColumState>
{
	private final JdbcTableState myJdbcTableState;

	public DatabaseJdbcColumnNode(Project project, @Nonnull JdbcTableColumState value, JdbcTableState jdbcTableState)
	{
		super(project, value);
		myJdbcTableState = jdbcTableState;
	}

	@RequiredReadAction
	@Nonnull
	@Override
	public Collection<? extends AbstractTreeNode> getChildren()
	{
		return Collections.emptyList();
	}

	@Override
	protected void update(PresentationData presentationData)
	{
		ImageKey icon = DatabaseIconGroup.nodesColumn();
		List<JdbcPrimaryKeyState> primaryKeys = myJdbcTableState.getPrimaryKeys();
		for(JdbcPrimaryKeyState primaryKey : primaryKeys)
		{
			if(getValue().getName().equals(primaryKey.getColumnName()))
			{
				icon = DatabaseIconGroup.nodesPrimary_key();
				break;
			}
		}

		presentationData.setIcon(icon);
		presentationData.addText(getValue().getName(), SimpleTextAttributes.REGULAR_ATTRIBUTES);
		presentationData.addText(" : " + getValue().getType(), SimpleTextAttributes.GRAY_ATTRIBUTES);
	}

	@Override
	public boolean isAlwaysLeaf()
	{
		return true;
	}

	@Override
	public String toString()
	{
		return getValue().getName();
	}
}
