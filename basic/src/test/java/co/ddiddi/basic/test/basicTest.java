package co.ddiddi.basic.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class basicTest {

	@Test
	public void basicTest() throws Exception{
		assertEquals("", "");
	}
}
