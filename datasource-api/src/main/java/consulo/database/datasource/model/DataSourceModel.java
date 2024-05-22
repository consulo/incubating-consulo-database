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

import jakarta.annotation.Nonnull;
import jakarta.annotation.Nullable;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/**
 * @author VISTALL
 * @since 2020-08-15
 */
public interface DataSourceModel
{
	@Nonnull
	List<? extends DataSource> getDataSources();

	@Nullable
	default DataSource findDataSource(@Nonnull UUID id)
	{
		for(DataSource source : getDataSources())
		{
			if(Objects.equals(source.getId(), id))
			{
				return source;
			}
		}

		return null;
	}
}
