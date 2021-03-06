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

package consulo.database.datasource.transport;

import com.intellij.openapi.components.PersistentStateComponent;
import com.intellij.openapi.components.ServiceManager;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.AsyncResult;
import com.intellij.util.messages.Topic;
import consulo.annotation.access.RequiredReadAction;
import consulo.database.datasource.model.DataSource;

import javax.annotation.Nonnull;

/**
 * @author VISTALL
 * @since 2020-08-14
 */
public interface DataSourceTransportManager
{
	Topic<DataSourceTransportListener> TOPIC = Topic.create("DataSourceTransportListener", DataSourceTransportListener.class);

	@Nonnull
	static DataSourceTransportManager getInstance(@Nonnull Project project)
	{
		return ServiceManager.getService(project, DataSourceTransportManager.class);
	}

	@Nonnull
	AsyncResult<Void> testConnection(@Nonnull DataSource dataSource);

	@RequiredReadAction
	void refreshAll();

	<T extends PersistentStateComponent<?>> T getDataState(@Nonnull DataSource dataSource);
}
