import org.junit.Assert;
import org.junit.Test;
import secuenciaCiclicaIncremental.SecuenciaCiclicaIncremental;

public class SecuenciaCiclicaIncrementalTest {	

	int secuencia01[] = {5, 9, 1, 2, 4};
	int secuencia02[] = {1, 3, 2};
	int secuencia03[] = {1, 4, 10, -2, 0};
	int secuencia04[] = {-2, 0, -1};
	int secuencia05[] = {1};
	int secuencia06[] = {0, 0};
	int secuencia07[] = {4,1,1,2,3};
	
	SecuenciaCiclicaIncremental s = new SecuenciaCiclicaIncremental();

	@Test
	public void test_secuencia01() {
		for (int i : secuencia01) {
			System.out.print(i + " ");
		}
		System.out.println("-> " + s.secuenciaCiclica(secuencia01));
		Assert.assertEquals(true, s.secuenciaCiclica(secuencia01));
	}
	
	@Test
	public void test_secuencia02() {
		for (int i : secuencia02) {
			System.out.print(i + " ");
		}
		System.out.println("-> " + s.secuenciaCiclica(secuencia02));
		Assert.assertEquals(false, s.secuenciaCiclica(secuencia02));
	}

	@Test
	public void test_secuencia03() {
		for (int i : secuencia03) {
			System.out.print(i + " ");
		}
		System.out.println("-> " + s.secuenciaCiclica(secuencia03));
		Assert.assertEquals(true, s.secuenciaCiclica(secuencia03));
	}

	@Test
	public void test_secuencia04() {
		for (int i : secuencia04) {
			System.out.print(i + " ");
		}
		System.out.println("-> " + s.secuenciaCiclica(secuencia04));
		Assert.assertEquals(false, s.secuenciaCiclica(secuencia04));
	}

	@Test
	public void test_secuencia05() {
		for (int i : secuencia05) {
			System.out.print(i + " ");
		}
		System.out.println("-> " + s.secuenciaCiclica(secuencia05));
		Assert.assertEquals(true, s.secuenciaCiclica(secuencia05));
	}
	
	@Test
	public void test_secuencia06() {
		for (int i : secuencia06) {
			System.out.print(i + " ");
		}
		System.out.println("-> " + s.secuenciaCiclica(secuencia06));
		Assert.assertEquals(true, s.secuenciaCiclica(secuencia06));
	}

	@Test
	public void test_secuencia07() {
		for (int i : secuencia07) {
			System.out.print(i + " ");
		}
		System.out.println("-> " + s.secuenciaCiclica(secuencia07));
		Assert.assertEquals(true, s.secuenciaCiclica(secuencia07));
	}
}
