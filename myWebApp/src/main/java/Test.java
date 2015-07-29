import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
@Autowired
	User user;
	public static void main(String[] args) {
	ApplicationContext appContext = new ClassPathXmlApplicationContext("application-context.xml");
	MyFirstBean myFirstBean = (MyFirstBean) appContext.getBean("myFirstBean");
	myFirstBean.go();
	System.out.println(myFirstBean.getName());
	System.out.println(myFirstBean.getCount());
	
	MyFirstBean myBean1 = (MyFirstBean) appContext.getBean("myFirstBean");
	myBean1.setName("Vasyl");
	System.out.println(myBean1.getName());
	System.out.println(myBean1.getCount());
	
	
	
	
	
	ApplicationContext appContext1 = new ClassPathXmlApplicationContext("application-context.xml");
	MySBean mySBean = (MySBean) appContext1.getBean("mySBean");
	MySBean mySBean1 = (MySBean) appContext1.getBean("mySBean");
	mySBean1.setNname("Somename");
	MySBean mySBean2 = (MySBean) appContext1.getBean("mySBean");
//	mySBean1.setList(list<name="somena,e", age=>); rozibratys
	
	
	System.out.println(mySBean.getNname());
	System.out.println(mySBean.getId());
	
	System.out.println(mySBean.getUser().getName());
	System.out.println(mySBean.getList().get(0).getName());
	System.out.println(mySBean.getList().get(0).getAge());
	System.out.println(mySBean1.getList().get(1).getName());
	System.out.println(mySBean1.getList().get(2).getName());
	System.out.println(mySBean.getMap().get(0));	
	}

}
