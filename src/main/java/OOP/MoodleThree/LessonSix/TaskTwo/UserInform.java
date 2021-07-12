package OOP.MoodleThree.LessonSix.TaskTwo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserInform {
    private Integer userId;
    private Integer id;
    private String title;
    private boolean completed;
}
