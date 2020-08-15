package consulo.database.datasource.provider.impl;

import com.intellij.openapi.components.PersistentStateComponent;
import com.intellij.util.xmlb.XmlSerializerUtil;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author VISTALL
 * @since 2020-08-15
 */
public class JdbcTables implements PersistentStateComponent<JdbcTables>
{
	private List<JdbcTable> myTables = new ArrayList<>();

	@Nonnull
	public List<JdbcTable> getTables()
	{
		return myTables;
	}

	@Nullable
	@Override
	public JdbcTables getState()
	{
		return this;
	}

	@Override
	public void loadState(JdbcTables state)
	{
		XmlSerializerUtil.copyBean(state, this);
	}
}
