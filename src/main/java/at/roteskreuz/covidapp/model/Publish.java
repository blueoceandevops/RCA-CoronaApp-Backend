package at.roteskreuz.covidapp.model;

import at.roteskreuz.covidapp.validation.ValidPublish;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author zolika
 */
@Getter
@Setter
@NoArgsConstructor
@ValidPublish
public class Publish {
	
	@Size(min = 0)
	@JsonProperty("temporaryTracingKeys")
	@Valid
	private List<ExposureKey> keys;
	
	private List<String> regions;

	private String 	appPackageName;

	private String 	platform;
	
	private Integer diagnosisStatus;

	private String 	deviceVerificationPayload;

	private String verificationAuthorityName;
	
	private String 	verificationPayload;
	
	private String 	padding;
	
	@NotBlank
	@Pattern(regexp = "red-warning|yellow-warning|green-warning", message = "The diagnosis type can be eighter red-warning, yellow-warning or green-warning")
	private String diagnosisType;
	
	@NotBlank
	private String uuid;

	@NotBlank
	private String authorization;

}
