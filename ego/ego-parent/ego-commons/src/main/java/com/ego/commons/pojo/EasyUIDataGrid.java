/**
 * 
 */
package com.ego.commons.pojo;

import java.io.Serializable;
import java.util.List;

/**
 * @author XYan
 *
 */
public class EasyUIDataGrid implements Serializable{
	private long total;
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	public List<?> getRows() {
		return rows;
	}
	public void setRows(List<?> rows) {
		this.rows = rows;
	}
	private List<?> rows;
	

}