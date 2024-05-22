/*
 * Copyright 2013-2021 consulo.io
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

package consulo.sql.lang.api;

import consulo.language.version.LanguageVersion;

import jakarta.annotation.Nonnull;

/**
 * @author VISTALL
 * @since 22/10/2021
 */
public class SqlLanguageVersion extends LanguageVersion
{
	public SqlLanguageVersion(@Nonnull String id, @Nonnull String name)
	{
		super(id, name, SqlLanguage.INSTANCE);
	}
}
