package consulo.database.datasource.jdbc.provider.impl;

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
public class JdbcState implements PersistentStateComponent<JdbcState>
{
	private List<JdbcTableState> myTables = new ArrayList<>();

	@Nonnull
	public List<JdbcTableState> getTables()
	{
		return myTables;
	}

	public void addTable(@Nonnull JdbcTableState state)
	{
		myTables.add(state);
	}

	@Nullable
	@Override
	public JdbcState getState()
	{
		return this;
	}

	@Override
	public void loadState(JdbcState state)
	{
		XmlSerializerUtil.copyBean(state, this);
	}
}