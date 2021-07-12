package OOP.MoodleThree.LessonSix.TaskOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Integer postId;
    private Integer Id;
    private String name;
    private String email;
    private String body;
}
