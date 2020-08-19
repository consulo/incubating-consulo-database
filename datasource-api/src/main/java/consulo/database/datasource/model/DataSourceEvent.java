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

package consulo.database.datasource.model;

import consulo.database.datasource.DataSourceManager;

import java.util.EventObject;

/**
 * @author VISTALL
 * @since 2020-08-15
 */
public class DataSourceEvent extends EventObject
{
	public enum Action
	{
		ADD,
		CHANGE,
		REMOVE
	}

	private final Action myAction;
	private final DataSource myDataSource;

	public DataSourceEvent(DataSourceManager source, Action action, DataSource dataSource)
	{
		super(source);
		myAction = action;
		myDataSource = dataSource;
	}

	public DataSource getDataSource()
	{
		return myDataSource;
	}

	public Action getAction()
	{
		return myAction;
	}

	@Override
	public DataSourceManager getSource()
	{
		return (DataSourceManager) super.getSource();
	}
}
