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

package consulo.database.impl.configurable;

import consulo.database.datasource.configurable.EditablePropertiesHolder;
import consulo.database.datasource.configurable.GenericPropertyKey;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/**
 * @author VISTALL
 * @since 2020-08-16
 */
public class EditablePropertiesHolderImpl extends PropertiesHolderImpl implements EditablePropertiesHolder
{
	public EditablePropertiesHolderImpl(@Nonnull String name)
	{
		super(name);
	}

	@Override
	public <T> void set(@Nonnull GenericPropertyKey<T> key, @Nullable T value)
	{
		if(value == null)
		{
			myValues.remove(key.toString());
		}
		else
		{
			myValues.put(key.toString(), new UnstableValue(value));
		}
	}
}
