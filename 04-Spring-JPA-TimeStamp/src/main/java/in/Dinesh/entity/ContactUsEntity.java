package in.Dinesh.entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="contact_us_leads")
public class ContactUsEntity 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String cname;
	private String cemail;
	private String cphno;
	
	@CreationTimestamp
	@Column(name="created_date",updatable = false)
	private LocalDate createdDate;
	
	
	@UpdateTimestamp
	@Column(name="updated_date",insertable = false)
	private LocalDate updatedDate;

}
