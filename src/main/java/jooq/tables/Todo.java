/**
 * This class is generated by jOOQ
 */
package jooq.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jooq.Keys;
import jooq.Public;
import jooq.tables.records.TodoRecord;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Todo extends TableImpl<TodoRecord> {

	private static final long serialVersionUID = -950829599;

	/**
	 * The reference instance of <code>PUBLIC.TODO</code>
	 */
	public static final Todo TODO = new Todo();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<TodoRecord> getRecordType() {
		return TodoRecord.class;
	}

	/**
	 * The column <code>PUBLIC.TODO.ID</code>.
	 */
	public final TableField<TodoRecord, Long> ID = createField("ID", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>PUBLIC.TODO.TITLE</code>.
	 */
	public final TableField<TodoRecord, String> TITLE = createField("TITLE", org.jooq.impl.SQLDataType.VARCHAR.length(256), this, "");

	/**
	 * The column <code>PUBLIC.TODO.COMPLETED</code>.
	 */
	public final TableField<TodoRecord, Boolean> COMPLETED = createField("COMPLETED", org.jooq.impl.SQLDataType.BOOLEAN.defaulted(true), this, "");

	/**
	 * The column <code>PUBLIC.TODO.ORDER</code>.
	 */
	public final TableField<TodoRecord, Integer> ORDER = createField("ORDER", org.jooq.impl.SQLDataType.INTEGER.defaulted(true), this, "");

	/**
	 * Create a <code>PUBLIC.TODO</code> table reference
	 */
	public Todo() {
		this("TODO", null);
	}

	/**
	 * Create an aliased <code>PUBLIC.TODO</code> table reference
	 */
	public Todo(String alias) {
		this(alias, TODO);
	}

	private Todo(String alias, Table<TodoRecord> aliased) {
		this(alias, aliased, null);
	}

	private Todo(String alias, Table<TodoRecord> aliased, Field<?>[] parameters) {
		super(alias, Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<TodoRecord, Long> getIdentity() {
		return Keys.IDENTITY_TODO;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<TodoRecord> getPrimaryKey() {
		return Keys.CONSTRAINT_2;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<TodoRecord>> getKeys() {
		return Arrays.<UniqueKey<TodoRecord>>asList(Keys.CONSTRAINT_2);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Todo as(String alias) {
		return new Todo(alias, this);
	}

	/**
	 * Rename this table
	 */
	public Todo rename(String name) {
		return new Todo(name, null);
	}
}
