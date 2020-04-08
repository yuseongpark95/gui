package database;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class MemberVO {
	// memberTBL 내용 담기
	private int no;
	private String name;
	private int age;
	private String gender;
}
