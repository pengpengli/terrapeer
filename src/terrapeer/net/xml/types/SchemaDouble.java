/**
 * SchemaDouble.java
 *
 * This file was generated by XMLSPY 5 Enterprise Edition.
 *
 * YOU SHOULD NOT MODIFY THIS FILE, BECAUSE IT WILL BE
 * OVERWRITTEN WHEN YOU RE-RUN CODE GENERATION.
 *
 * Refer to the XMLSPY Documentation for further details.
 * http://www.altova.com/xmlspy
 */

package terrapeer.net.xml.types;

public class SchemaDouble implements SchemaType {
	protected double value;

	public SchemaDouble(double newvalue) {
		value = newvalue;
	}

	public SchemaDouble(String newvalue) {
		value = Double.parseDouble(newvalue);
	}

	public double getValue() {
		return value;
	}

	public void setValue(double newvalue) {
		value = newvalue;
	}

	public void setValue(String newvalue) {
		value = Double.parseDouble(newvalue);
	}

	public int hashCode() {
		return (int)Double.doubleToLongBits(value);
	}

	public boolean equals(Object obj) {
		if (!(obj instanceof SchemaDouble))
			return false;
		return value == ((SchemaDouble)obj).value;
	}

	public Object clone() {
		return new SchemaDouble(value);
	}

	public String toString() {
		return Double.toString(value);
	}

	public String asString() {
		return toString();
	}

	public int compareTo(Object obj) {
		return compareTo((SchemaDouble)obj);
	}

	public int compareTo(SchemaDouble obj) {
		return Double.compare(value, obj.value);
	}
}