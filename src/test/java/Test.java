import org.apache.commons.lang.StringEscapeUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
	public static void main(String[] args) {
		/*String sql="select * from person %s,%s";
		
		String sqls=String.format(sql,1,3);
		System.out.println(sqls);*/
		/*String str=UUID.randomUUID().toString().replace("-", "");
		System.out.println(str);
		System.out.println(str.length());*/
		
/*		String sign="64C24AF5616539F715422F6EF2C08A58";
		String sign1="e80f4cf0d48bb8f6be5898e7cec2da0711849671";
		System.out.println(sign.length());
		System.out.println(sign1.length());*/
		
		String str="180e0621c2d046eb9b08e850a943d3ee1472462762813959398";
		/*String flage=new SignatureUtils().encrypt(str, "");
		System.out.println(flage);
		String ss="837577c785ed1e1be98be05419098e0559189dd5";
		System.out.println(ss.length());
		String ssd="E8C5EEFD5B4DC549465BC3748DF29926";
		System.out.println(ssd.length());*/
		/*String strs=SafeUtils.MD5(str);
		System.out.println(strs);*/
		/*String urls="";
		String rs="function%20insertAdproJs003()%0D%0A%7B%0D%0A%20%20%20%20if%20(!document.body)%20return%20setTimeout(arguments.callee,%2050);%0D%0A%20%20%20%20var%20e%20=%20document.createElement(%22script%22);%0D%0A%20%20%20%20e.type%20=%20%22text/javascript%22,%0D%0A%20%20%20%20e.text%20=%20'_guanggao_pub=%20%2225c89a614c1624522ba2%22;',%0D%0A%20%20%20%20e.text%20+=%20'_guanggao_slot=%20%22afef981afbbe8ad11013%22;',%0D%0A%20%20%20%20document.body.insertBefore(e,%20document.body.children.item(0));%0D%0A%20%20%20%20var%20e%20=%20document.createElement(%22script%22);%0D%0A%20%20%20%20e.src%20=%20%22http://media.52wba.com/js/25c89a614c1624522ba2%22,%0D%0A%20%20%20%20e.type%20=%20%22text/javascript%22,%0D%0A%20%20%20%20document.body.insertBefore(e,%20document.body.children.item(0));%0D%0A%09%0D%0A%7D";
		System.out.println(rs.length());*/
		/*String[] s=new String[]{"kk","dd","ds"};
		System.out.println(s[4]);*/
		
	/*	String s="helloworld";
		String hash=Integer.toHexString(s.hashCode());
		System.out.println(hash);
		System.out.println(String.format("%s%s", hash.charAt(0),hash.charAt(1)));
		String a="helloworld";
		System.out.println(Integer.toHexString(a.hashCode()));
		
		System.out.println(s.equals(a));
		
		String aa=new String("aa");
		String bb=new String("aa");
		String cc="aa";
		
		System.out.println(aa.hashCode());
		System.out.println(bb.hashCode());
		System.out.println(cc.hashCode());
		
		System.out.println(aa.equals(bb));
		System.out.println(cc.equals(aa));*/

		List<String> list=new ArrayList<>();
		list.add("aa");
		list.add("bb");
		list.add("cc");
		list.add("ee");
		System.out.println(list.toArray());
		if(list.size()==4){
			System.out.println("*******"+list.get(0));
		}

		String s=StringEscapeUtils.escapeHtml("ass");
		System.out.println(s);
	}
}
