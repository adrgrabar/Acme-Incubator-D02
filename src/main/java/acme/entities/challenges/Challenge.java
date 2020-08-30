
package acme.entities.challenges;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import acme.framework.datatypes.Money;
import acme.framework.entities.DomainEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Challenge extends DomainEntity {

	private static final long	serialVersionUID	= 1L;

	@NotBlank
	private String				title;

	@Temporal(TemporalType.TIMESTAMP)
	@NotNull
	private Date				deadline;

	@NotBlank
	@Column(length = 1024)
	private String				description;

	@NotBlank
	private String				goldLevelGoal;

	@NotBlank
	private String				silverLevelGoal;

	@NotBlank
	private String				bronzeLevelGoal;

	@NotNull
	@Valid
	private Money				goldLevelReward;

	@NotNull
	@Valid
	private Money				silverLevelReward;

	@NotNull
	@Valid
	private Money				bronzeLevelReward;

}
