import java.util.*;

class Quiz {
    public String name;
    public List<Question> questions;
    
    public Quiz(String name) {
        this.name = name;
        this.questions = new ArrayList<>();
    }
    
    public void addQuestion(Question question) {
        questions.add(question);
    }
    
    public void takeQuiz() {
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        
        for (Question question : questions) {
            System.out.println(question.getPrompt());
            List<String> choices = question.getChoices();
            
            for (int i = 0; i < choices.size(); i++) {
                System.out.println((i + 1) + ". " + choices.get(i));
            }
            
            int answer = scanner.nextInt();
            
            if (question.checkAnswer(answer)) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect!");
            }
        }
        
        System.out.println("You scored " + score + " out of " + questions.size());
    }
}

class Question {
    public String prompt;
    public List<String> choices;
    public  int answer;
    
    public Question(String prompt, List<String> choices, int answer) {
        this.prompt = prompt;
        this.choices = choices;
        this.answer = answer;
    }
    
    public String getPrompt() {
        return prompt;
    }
    
    public List<String> getChoices() {
        return choices;
    }
    
    public boolean checkAnswer(int answer) {
        return this.answer == answer;
    }
}

class QuizManagementSystem {
    public static void main(String[] args) {
        Quiz quiz = new Quiz("Test Quiz");
        
        Question q1 = new Question("Which of the following is a type of polymorphism in Java Programming?", Arrays.asList("Multiple polymorphism", "Compile time polymorphism", "Multilevel polymorphism", "Execution time polymorphism"), 2);
        Question q2 = new Question("What is the extension of compiled java classes?", Arrays.asList(".txt", ".js", ".class", ".java"), 3);
        Question q3 = new Question("Which of these are selection statements in Java?", Arrays.asList("break", "continue", "for()", "if()"), 4);
        Question q4 = new Question("Who invented Java Programming?", Arrays.asList("Guido van Rossum", "James Gosling", " Dennis Ritchie", "Bjarne Stroustrup"), 2);
        Question q5 = new Question("Which statement is true about Java?", Arrays.asList("Java is a sequence-dependent programming language", "Java is a code dependent programming language", "Java is a platform-dependent programming language", "Java is a platform-independent programming language"), 4);
        Question q6 = new Question("Which component is used to compile, debug and execute the java programs?", Arrays.asList("JRE", "JIT", "JDK", "JVM"), 3);
        Question q7 = new Question("Which one of the following is not a Java feature?", Arrays.asList("Object-oriented", "Use of pointers", "Portable", "Dynamic and Extensible"), 2);
        Question q8 = new Question("Which of these cannot be used for a variable name in Java?", Arrays.asList("identifier & keyword", "identifier", "keyword", "none of the mentioned"), 3);
        Question q9 = new Question("What is the extension of java code files?", Arrays.asList(".js", ".txt", ".class", ".java"), 4);
        Question q10 = new Question("Which of the following is not an OOPS concept in Java?", Arrays.asList("Polymorphism", "Inheritance", "Compilation", "Encapsulation"), 3);

        quiz.addQuestion(q1);
        quiz.addQuestion(q2);
        quiz.addQuestion(q3);
        quiz.addQuestion(q4);
        quiz.addQuestion(q5);
        quiz.addQuestion(q6);
        quiz.addQuestion(q7);
        quiz.addQuestion(q8);
        quiz.addQuestion(q9);
        quiz.addQuestion(q10);

        
        quiz.takeQuiz();
    }
}
