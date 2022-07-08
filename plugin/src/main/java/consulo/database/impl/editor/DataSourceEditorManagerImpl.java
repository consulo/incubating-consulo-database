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

import consulo.annotation.component.ServiceImpl;
import consulo.database.datasource.editor.DataSourceEditorManager;
import consulo.database.datasource.model.DataSource;
import consulo.fileEditor.FileEditorManager;
import consulo.project.Project;
import consulo.virtualFileSystem.VirtualFile;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

import javax.annotation.Nonnull;

/**
 * @author VISTALL
 * @since 2020-08-19
 */
@Singleton
@ServiceImpl
public class DataSourceEditorManagerImpl implements DataSourceEditorManager
{
	private final Project myProject;

	@Inject
	public DataSourceEditorManagerImpl(Project project)
	{
		myProject = project;
	}

	@Override
	public void openEditor(@Nonnull DataSource dataSource, @Nonnull String dbName, @Nonnull String childId)
	{
		VirtualFile file = DataSourceVirtualFileSystem.getInstance().createFile(dataSource, dbName, childId);

		FileEditorManager.getInstance(myProject).openFile(file, true);
	}
}
