package unical.id.ProvaIngSw_213568;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.joda.time.DateTime;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyListUtilTest {
	
	List<Integer> list = new ArrayList<Integer>();
	List<Integer> testListCrescente = new ArrayList<Integer>();
	List<Integer> testListDecrescente = new ArrayList<Integer>();
	MyListUtil myListUtil;
	
	@BeforeClass
	public static void before() {
		DateTime time = DateTime.now();
		System.out.println("Ora inizio dei test: " + time);
	}
	
	@AfterClass
	public static void after() {
		DateTime time = DateTime.now();
		System.out.println("Ora fine dei test: " + time);
	}
	
	@Before
	public void init() {
		list.add(2);
		list.add(1);
		list.add(5);
		list.add(4);
		list.add(3);
		testListCrescente.add(1);
		testListCrescente.add(2);
		testListCrescente.add(3);
		testListCrescente.add(4);
		testListCrescente.add(5);
		testListDecrescente.add(5);
		testListDecrescente.add(4);
		testListDecrescente.add(3);
		testListDecrescente.add(2);
		testListDecrescente.add(1);
		myListUtil = new MyListUtil();
	}
	
	@Test
	public void sortTestCrescente() {	
		assertEquals(testListCrescente, myListUtil.sort(list, 0));
	}
	
	@Test
	public void sortTestDecrescente() {
		assertEquals(testListDecrescente, myListUtil.sort(list, 1));
	}
	
	@Test(timeout = 5000)
	public void sortIsFastEnough() {
		assertEquals(testListCrescente, myListUtil.sort(list, 0));
		assertEquals(testListDecrescente, myListUtil.sort(list, 1));
	}

}
