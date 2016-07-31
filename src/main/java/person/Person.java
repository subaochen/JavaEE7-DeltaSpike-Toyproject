package person;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Person
{
	@Id
	@GeneratedValue
	private long id;

	private String ssn;

	public String getSsn()
	{
		return ssn;
	}

	public void setSsn( final String ssn )
	{
		this.ssn = ssn;
	}

	public long getId()
	{
		return id;
	}

	public void setId( final long id )
	{
		this.id = id;
	}
}
