package Table;

import java.util.List; 

import javax.swing.table.AbstractTableModel;

import Model.User;

public class TableUser extends AbstractTableModel{
	
	List<User> ls;
	private String[] columnNames = {"id", "name" , "username" , "password"};
	public TableUser(List<User> ls) {
		this.ls = ls;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return ls.size();
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 4;
	}
	
	@Override
	public String getColumnName(int column) {
		return columnNames[column];
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		
		switch (columnIndex) {
		case 0:
			return ls.get(rowIndex).getId();
		case 1:
			return ls.get(rowIndex).getNama();
		case 2:
			return ls.get(rowIndex).getUsername();
		case 3:
			return ls.get(rowIndex).getPassword();
		default:
			return null;
		}
		
	}
	

}
