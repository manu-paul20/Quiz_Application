<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Quiz Application - README</title>
</head>
<body style="font-family: sans-serif; margin: 2rem; background-color: #f8f8f8; color: #333;">
    <div style="max-width: 900px; margin: 2rem auto; padding: 2rem; background-color: #ffffff; border-radius: 8px; box-shadow: 0 2px 4px rgba(0,0,0,0.1);">
        <header style="text-align: center; margin-bottom: 2rem;">
            <h1 style="font-size: 2.5em; color: #222; margin-bottom: 0.5em;">Quiz Application</h1>
            <p style="font-size: 1.1em; color: #555;">A simple desktop quiz application built with Java Swing.</p>
        </header>

        <section style="margin-bottom: 2rem;">
            <h2 style="font-size: 1.8em; color: #222; border-bottom: 1px solid #eee; padding-bottom: 0.5em;">Features</h2>
            <ul style="list-style-type: disc; margin-left: 20px; margin-bottom: 1em;">
                <li><strong>Multiple-Choice Questions:</strong> Presents questions with several options.</li>
                <li><strong>Score Tracking:</strong> Keeps track of the user's correct answers.</li>
                <li><strong>Timer (Optional/Implied):</strong> While not explicitly visible in the provided snippet, quiz applications often include a timer.</li>
                <li><strong>User Interface:</strong> Built with Java Swing for a standard desktop application experience.</li>
                <li><strong>Question Navigation:</strong> Allows users to move through questions.</li>
                <li><strong>Result Display:</strong> Shows the final score at the end of the quiz.</li>
            </ul>
        </section>

        <section style="margin-bottom: 2rem;">
            <h2 style="font-size: 1.8em; color: #222; border-bottom: 1px solid #eee; padding-bottom: 0.5em;">Technologies Used</h2>
            <ul style="list-style-type: disc; margin-left: 20px; margin-bottom: 1em;">
                <li><strong>Java:</strong> The core programming language.</li>
                <li><strong>Java Swing:</strong> For building the graphical user interface (GUI).</li>
            </ul>
        </section>

        <section style="margin-bottom: 2rem;">
            <h2 style="font-size: 1.8em; color: #222; border-bottom: 1px solid #eee; padding-bottom: 0.5em;">Setup and Running</h2>
            <p>To get this project up and running on your local machine, follow these steps:</p>

            <details style="margin-bottom: 1em; border: 1px solid #ddd; border-radius: 4px;">
                <summary style="font-size: 1.2em; font-weight: bold; padding: 10px; cursor: pointer; background-color: #f0f0f0;">Prerequisites</summary>
                <div style="padding: 10px;">
                    <ul style="list-style-type: disc; margin-left: 20px; margin-bottom: 1em;">
                        <li><strong>Java Development Kit (JDK) 8 or higher:</strong> Ensure you have a compatible JDK installed on your system. You can download it from <a href="https://www.oracle.com/java/technologies/downloads/" target="_blank" rel="noopener noreferrer" style="color: #007bff; text-decoration: none;">Oracle's website</a> or use OpenJDK.</li>
                    </ul>
                </div>
            </details>

            <details style="margin-bottom: 1em; border: 1px solid #ddd; border-radius: 4px;">
                <summary style="font-size: 1.2em; font-weight: bold; padding: 10px; cursor: pointer; background-color: #f0f0f0;">Installation and Execution</summary>
                <div style="padding: 10px;">
                    <ol style="list-style-type: decimal; margin-left: 20px;">
                        <li>
                            <p><strong>Clone the Repository:</strong><br>
                            Open your terminal or command prompt and run the following command to clone the project:</p>
                            <pre style="background-color: #eee; padding: 1em; border-radius: 4px; overflow-x: auto; position: relative;"><button class="copy-button" onclick="copyCode(this)" style="position: absolute; top: 8px; right: 8px; background-color: #007bff; color: white; border: none; padding: 6px 12px; border-radius: 4px; cursor: pointer; font-size: 0.9em;">Copy Code</button><code style="font-family: monospace; font-size: 0.9em;">git clone https://github.com/manu-paul20/Quiz_Application.git</code></pre>
                        </li>
                        <li>
                            <p><strong>Navigate to the Project Directory:</strong></p>
                            <pre style="background-color: #eee; padding: 1em; border-radius: 4px; overflow-x: auto; position: relative;"><button class="copy-button" onclick="copyCode(this)" style="position: absolute; top: 8px; right: 8px; background-color: #007bff; color: white; border: none; padding: 6px 12px; border-radius: 4px; cursor: pointer; font-size: 0.9em;">Copy Code</button><code style="font-family: monospace; font-size: 0.9em;">cd Quiz_Application</code></pre>
                        </li>
                        <li>
                            <p><strong>Open in an IDE (Recommended - IntelliJ IDEA/Eclipse):</strong></p>
                            <ul style="list-style-type: disc; margin-left: 20px;">
                                <li>
                                    <p><strong>IntelliJ IDEA:</strong></p>
                                    <ul style="list-style-type: disc; margin-left: 20px;">
                                        <li>Open IntelliJ IDEA.</li>
                                        <li>Select `File` > `Open...`</li>
                                        <li>Navigate to the `Quiz_Application` directory you just cloned and click `OK`.</li>
                                        <li>IntelliJ should automatically detect it as a Java project.</li>
                                    </ul>
                                </li>
                                <li>
                                    <p><strong>Eclipse:</strong></p>
                                    <ul style="list-style-type: disc; margin-left: 20px;">
                                        <li>Open Eclipse.</li>
                                        <li>Select `File` > `Import...`</li>
                                        <li>Choose `Maven` > `Existing Maven Projects` (if it's a Maven project, otherwise `General` > `Existing Projects into Workspace`).</li>
                                        <li>Browse to the `Quiz_Application` directory and import.</li>
                                    </ul>
                                </li>
                            </ul>
                        </li>
                        <li>
                            <p><strong>Run the Application:</strong></p>
                            <ul style="list-style-type: disc; margin-left: 20px;">
                                <li>Locate the main class (e.g., `QuizApp.java` or similar, which contains the `public static void main(String[] args)` method).</li>
                                <li>Right-click on the main class file in your IDE.</li>
                                <li>Select `Run 'MainClassName.main()'`.</li>
                            </ul>
                            <p>Alternatively, you can compile and run from the command line (if not using an IDE for execution):</p>
                            <pre style="background-color: #eee; padding: 1em; border-radius: 4px; overflow-x: auto; position: relative;"><button class="copy-button" onclick="copyCode(this)" style="position: absolute; top: 8px; right: 8px; background-color: #007bff; color: white; border: none; padding: 6px 12px; border-radius: 4px; cursor: pointer; font-size: 0.9em;">Copy Code</button><code style="font-family: monospace; font-size: 0.9em;"># Compile the Java files (adjust classpath if necessary)
javac src/main/java/com/yourpackage/QuizApp.java # Adjust path to your main class

# Run the application
java -cp src/main/java com.yourpackage/QuizApp # Adjust path and package name</code></pre>
                            <p style="font-size: 0.9em; color: #777; font-style: italic;">(Note: The exact package structure might vary based on your project's `src` layout. You might need to compile all `.java` files and then run the main class.)</p>
                        </li>
                    </ol>
                </div>
            </details>
        </section>

        <section style="margin-bottom: 2rem;">
            <details style="margin-bottom: 1em; border: 1px solid #ddd; border-radius: 4px;">
                <summary style="font-size: 1.2em; font-weight: bold; padding: 10px; cursor: pointer; background-color: #f0f0f0;">Code Structure (Assumed)</summary>
                <div style="padding: 10px;">
                    <p>Based on typical Java Swing applications, the project likely contains:</p>
                    <ul style="list-style-type: disc; margin-left: 20px;">
                        <li>`QuizApp.java` (or similar): The main entry point of the application, responsible for setting up the `JFrame` and initiating the quiz flow.</li>
                        <li>`Question.java` (or similar): A model class to represent a single quiz question, possibly holding the question text, options, and correct answer.</li>
                        <li>`QuizPanel.java` (or similar): A `JPanel` subclass that handles the display of questions, user input, and navigation.</li>
                        <li>`ResultPanel.java` (or similar): A `JPanel` subclass to display the final score and quiz summary.</li>
                    </ul>
                </div>
            </details>
        </section>

        <section style="margin-bottom: 2rem;">
            <h2 style="font-size: 1.8em; color: #222; border-bottom: 1px solid #eee; padding-bottom: 0.5em;">Screenshots</h2>
            <div style="display: grid; grid-template-columns: repeat(auto-fit, minmax(280px, 1fr)); gap: 16px;">
                <div style="background-color: #eee; color: #777; display: flex; justify-content: center; align-items: center; height: 200px; border-radius: 8px; text-align: center; border: 1px dashed #ccc;">
                    <p>Main Quiz Screen Placeholder</p>
                </div>
                <div style="background-color: #eee; color: #777; display: flex; justify-content: center; align-items: center; height: 200px; border-radius: 8px; text-align: center; border: 1px dashed #ccc;">
                    <p>Results Screen Placeholder</p>
                </div>
            </div>
            <p style="font-size: 0.9em; color: #777; font-style: italic; margin-top: 0.5em;">*(If you have screenshots of your application in action, you can replace these placeholders with image tags.)*</p>
        </section>

        <section style="margin-bottom: 2rem;">
            <details style="margin-bottom: 1em; border: 1px solid #ddd; border-radius: 4px;">
                <summary style="font-size: 1.2em; font-weight: bold; padding: 10px; cursor: pointer; background-color: #f0f0f0;">Future Enhancements</summary>
                <div style="padding: 10px;">
                    <ul style="list-style-type: disc; margin-left: 20px;">
                        <li>Add a timer for each question or the entire quiz.</li>
                        <li>Implement different difficulty levels.</li>
                        <li>Store questions in an external file (e.g., CSV, JSON, XML) for easier management.</li>
                        <li>Add more question types (e.g., true/false, fill-in-the-blanks).</li>
                        <li>Improve UI/UX with more modern Swing components or a different GUI library.</li>
                        <li>Implement a high-score system.</li>
                    </ul>
                </div>
            </details>
        </section>

        <section style="margin-bottom: 2rem;">
            <h2 style="font-size: 1.8em; color: #222; border-bottom: 1px solid #eee; padding-bottom: 0.5em;">Contributing</h2>
            <p>Contributions are welcome! If you have suggestions for improvements or find any bugs, please open an issue or submit a pull request.</p>
        </section>

        <section style="margin-bottom: 2rem;">
            <h2 style="font-size: 1.8em; color: #222; border-bottom: 1px solid #eee; padding-bottom: 0.5em;">License</h2>
            <p>This project is licensed under the MIT License - see the <a href="https://github.com/manu-paul20/Quiz_Application/blob/main/LICENSE" target="_blank" rel="noopener noreferrer" style="color: #007bff; text-decoration: none;">LICENSE</a> file for details.</p>
        </section>

        <footer style="text-align: center; color: #777; font-size: 0.9em; margin-top: 2rem; padding-top: 1rem; border-top: 1px solid #eee;">
            <h2 style="font-size: 1.5em; color: #222; margin-bottom: 0.5em;">Author</h2>
            <p><strong>Manu Paul</strong> - <a href="https://github.com/manu-paul20" target="_blank" rel="noopener noreferrer" style="color: #007bff; text-decoration: none;">manu-paul20</a></p>
        </footer>
    </div>

    <script>
        function copyCode(button) {
            const preElement = button.parentElement;
            const codeElement = preElement.querySelector('code');
            const codeText = codeElement.innerText;

            const textarea = document.createElement('textarea');
            textarea.value = codeText;
            textarea.style.position = 'fixed';
            textarea.style.left = '-9999px';
            document.body.appendChild(textarea);
            textarea.focus();
            textarea.select();
            try {
                document.execCommand('copy');
                button.textContent = 'Copied!';
                setTimeout(() => {
                    button.textContent = 'Copy Code';
                }, 2000);
            } catch (err) {
                console.error('Failed to copy text: ', err);
                button.textContent = 'Error!';
            } finally {
                document.body.removeChild(textarea);
            }
        }
    </script>
</body>
</html>
