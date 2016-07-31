package person;


import javax.inject.Inject;

import org.apache.deltaspike.testcontrol.api.junit.CdiTestRunner;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;


@RunWith(CdiTestRunner.class)
public class PersonRepositoryTest
{
	@Inject
	private PersonRepository repo;

	@Test
	public void testPersonRepositoryInjection() {
		Assertions.assertThat( repo ).isNotNull();
	}
}
