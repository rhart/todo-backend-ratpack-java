/**
 * This class is generated by jOOQ
 */
package jooq.tables.records;


import javax.annotation.Generated;

import jooq.tables.Todo;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


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
public class TodoRecord extends UpdatableRecordImpl<TodoRecord> implements Record4<Long, String, Boolean, Integer> {

	private static final long serialVersionUID = 349719789;

	/**
	 * Setter for <code>PUBLIC.TODO.ID</code>.
	 */
	public void setId(Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>PUBLIC.TODO.ID</code>.
	 */
	public Long getId() {
		return (Long) getValue(0);
	}

	/**
	 * Setter for <code>PUBLIC.TODO.TITLE</code>.
	 */
	public void setTitle(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>PUBLIC.TODO.TITLE</code>.
	 */
	public String getTitle() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>PUBLIC.TODO.COMPLETED</code>.
	 */
	public void setCompleted(Boolean value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>PUBLIC.TODO.COMPLETED</code>.
	 */
	public Boolean getCompleted() {
		return (Boolean) getValue(2);
	}

	/**
	 * Setter for <code>PUBLIC.TODO.ORDER</code>.
	 */
	public void setOrder(Integer value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>PUBLIC.TODO.ORDER</code>.
	 */
	public Integer getOrder() {
		return (Integer) getValue(3);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<Long> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record4 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row4<Long, String, Boolean, Integer> fieldsRow() {
		return (Row4) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row4<Long, String, Boolean, Integer> valuesRow() {
		return (Row4) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field1() {
		return Todo.TODO.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return Todo.TODO.TITLE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Boolean> field3() {
		return Todo.TODO.COMPLETED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field4() {
		return Todo.TODO.ORDER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getTitle();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Boolean value3() {
		return getCompleted();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value4() {
		return getOrder();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TodoRecord value1(Long value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TodoRecord value2(String value) {
		setTitle(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TodoRecord value3(Boolean value) {
		setCompleted(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TodoRecord value4(Integer value) {
		setOrder(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TodoRecord values(Long value1, String value2, Boolean value3, Integer value4) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TodoRecord
	 */
	public TodoRecord() {
		super(Todo.TODO);
	}

	/**
	 * Create a detached, initialised TodoRecord
	 */
	public TodoRecord(Long id, String title, Boolean completed, Integer order) {
		super(Todo.TODO);

		setValue(0, id);
		setValue(1, title);
		setValue(2, completed);
		setValue(3, order);
	}
}
