package hibernate1.hb1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.telusko.demoHb.Alien;

public class App 
{
    public static void main( String[] args ) 
    {
    	Alien alien = new Alien();
		alien.setId(3);
		alien.setAge(130);
		alien.setName("Juventa");
		
		Configuration conf=new Configuration().configure();
		
		conf.addAnnotatedClass(Alien.class);
		
		ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(conf.getProperties()).buildServiceRegistry();
				
				
		SessionFactory sessionFactory = conf.buildSessionFactory(reg);
		
		
		Session session = sessionFactory.openSession();
		
		org.hibernate.Transaction tx = session.beginTransaction();
		
		//session.save(alien);
		
		Alien a=(Alien)session.get(Alien.class, 3);
		
		System.out.println(a);
		tx.commit();
    }
}
