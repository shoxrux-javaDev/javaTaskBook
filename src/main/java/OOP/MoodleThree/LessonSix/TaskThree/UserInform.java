package OOP.MoodleThree.LessonSix.TaskThree;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserInform {
    private Integer id;
    private String name;
    private String username;
    private String email;
    Address address;
    private String phone;
    private String website;
    Company company;
}
