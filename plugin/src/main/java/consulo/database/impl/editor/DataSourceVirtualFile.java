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

package consulo.database.impl.editor;

import com.intellij.ide.presentation.Presentation;
import com.intellij.openapi.vfs.VirtualFileSystem;
import com.intellij.testFramework.LightVirtualFile;
import consulo.database.datasource.model.DataSource;
import consulo.vfs.ArchiveFileSystem;

import javax.annotation.Nonnull;

/**
 * @author VISTALL
 * @since 2020-08-19
 */
@Presentation(provider = DataSourceFilePresentation.class)
public class DataSourceVirtualFile extends LightVirtualFile
{
	private final DataSource myDataSource;
	private final String myDatabaseName;
	private final String myChildId;
	private final VirtualFileSystem myVirtualFileSystem;

	public DataSourceVirtualFile(@Nonnull DataSource dataSource, @Nonnull String databaseName, @Nonnull String childId, @Nonnull VirtualFileSystem virtualFileSystem)
	{
		super("[" + dataSource.getName() + "] " + childId);

		myDataSource = dataSource;
		myDatabaseName = databaseName;
		myChildId = childId;
		myVirtualFileSystem = virtualFileSystem;
	}

	@Nonnull
	public String getDatabaseName()
	{
		return myDatabaseName;
	}

	@Nonnull
	public String getChildId()
	{
		return myChildId;
	}

	@Nonnull
	public DataSource getDataSource()
	{
		return myDataSource;
	}

	@Nonnull
	@Override
	public VirtualFileSystem getFileSystem()
	{
		return myVirtualFileSystem;
	}

	@Nonnull
	@Override
	public String getPath()
	{
		return myDataSource.getId() + ArchiveFileSystem.ARCHIVE_SEPARATOR + myDatabaseName + "/" + myChildId;
	}

	@Override
	public boolean equals(Object obj)
	{
		if(obj instanceof DataSourceVirtualFile)
		{
			return getPath().equals(((DataSourceVirtualFile) obj).getPath());
		}
		return super.equals(obj);
	}
}