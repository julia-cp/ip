package duke.command;

import duke.Storage;
import duke.TaskList;
import duke.Ui;

public class UnmarkCommand extends Command {
    public String message;
    public UnmarkCommand(String message) {
        super();
        this.message = message;
    }

    public void execute(TaskList taskList, Ui ui, Storage storage) {
        try {
            String number = message.split(" ")[1];
            int integerNumber = Integer.parseInt(number);
            taskList.unmark(integerNumber);
        } catch (ArrayIndexOutOfBoundsException e) {
            ui.showForgetTaskNumber();
            ui.showUnmarkFormat();
        } catch (NumberFormatException e) {
            ui.showUnmarkFormat();
        }
    }
    public  boolean isExit() {
        return false;
    }
}
