

import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.MapListHandler;
import org.junit.Ignore;
import org.junit.Test;

import com.tao.dbutils.entity.Person;
import com.tao.dbutils.service.impl.PersonServiceImpl;
import com.tao.utils.C3p0Utils;
import com.tao.utils.PageHelper;

public class DbutilsTest{
	
	static QueryRunner q=new QueryRunner(C3p0Utils.getDataSource());
	static final PersonServiceImpl serviceImpl=new PersonServiceImpl();
	@Ignore
	public void selectTest(){
		String sql="select * from person";
		try {
			List<Map<String, Object>> list=q.query(sql, new MapListHandler());
			System.out.println(list.toString());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	@Ignore
	public void addTest(){
		String sql="insert into person(name,pwd,address,phone,addTime) values('屠龙','242342','华夏','23423423','2016-08-06 00:00:00');";
		try {
			int count=q.update(sql);
			if(count>0){
				System.out.println("出入成功");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	@Ignore
	public void updateTest(){
		String sql="update person set name=?,pwd=?,phone=? where id=?";
		Object[] params={"里萨克斯","333222","1423423424",5};
		int count;
		try {
			count = q.update(sql, params);
			if(count>0){
				System.out.println("更改成功!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	@Ignore
	public void deleteTest(){
		String sql="delete from person where id=6";
		try {
			int count=q.update(sql);
			if(count>0){
				System.out.println("删除成功!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	@Ignore
	public void addBatch(){
		String sql="insert into person(name,pwd,address,phone,addTime) values(?,?,?,?,?);";
		Object[][] params=new Object[10][];
		for (int i = 0; i < params.length; i++) {
			params[i]=new Object[]{"苏东波"+i,"2141234","江南"+i,"3412341234","2016-08-05 00:00:00"};
		}
		int[] count;
		try {
			count = q.batch(sql, params);
			if(count.length>0){
				System.out.println("批量插入成功!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	@Ignore
	public void getListTest(){
		List<Person> list=serviceImpl.getList("select * from person",Person.class,null);
		for (Person person : list) {
			System.out.println(person.getName()+person.getPwd());
		}
	}
	
	@Ignore
	public void deletePersonTest(){
		if(serviceImpl.delete(12L)){
			System.out.println("删除成功!");
		}
	}
	@Ignore
	public void addPersonTest(){
		boolean flage=serviceImpl.add("insert into person(name,pwd,address,phone,addTime) values(?,?,?,?,?);", new Object[]{"欧阳修","123234","中原","1231234",new Date()});
		if(flage){
			System.out.println("插入 成功!");
		}
	}
	
	@Test
	public void getPageListTest(){
		PageHelper<Person> list=serviceImpl.getPageList("select * from person", Person.class, 2, 5,null);
		System.out.println(list.getTotalCount()+"***"+list.getPageCurrent());
		for (Person person :list.getList()) {
			System.out.println(person.getName());
		}
	}
	
}
