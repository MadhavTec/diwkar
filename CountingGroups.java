import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
 
 public class CountingGroups{
	 
	 
	 public static int[] countGroups(int[] [] m,int[] t){
		 
	 }
	 
public static void main(String[] args)throws IO Exception{
	Scanner in= new Scanner(System.in);
	final String filename = Sytem.getenv("OUTPUT_PATH");
	BufferedWriter bw= new BufferedWriter(new FileWriter(fileName));
	int[] res;
	
	int_m_rows = 0;
	int_m_cols = 0;
	_m_rows = Integer.parseInt(in.nextLine().trim());
	_m_cols = Integer.parseInt(in.nextLine().trim());
	
	int[][] _m= new int[_m_rows][_m_rows][_m_cols];
	int[][] _m= new int[_m_rows][_m_rows][_m_cols];
	
	for(int _m_i=0; _m_i<_m_rows; _m_i++){
		for(int _m_j=0; _m_j<_m_cols; _m_j++){
			_m[_m_i][_m_j] = in.nextInt();
		}
	}
	
	if(in.hasNextLine()){
		in.nextLine();
	}
	
	int _t_size = 0;
	_t_size = Integer.parseInt(in.nextLine().trim());
	int[] _t = new int[_t_size];
	int _t_item;
	for(int _t_i=0; _t_i < _t_size; _t_size; _t_i++){
		_t_size = Integer.parseInt(in.nextLine().trim());
		_t[_t_i] = _t_item;
	}
	
	res= countGroups(_m, _t);
	for(int res_i=0; res_i < res.length; res_i++){
		bw.write(String.valueOf(res[res_i]));
		bw.newLine();
	}
	bw.close();
   }
 }
 
	