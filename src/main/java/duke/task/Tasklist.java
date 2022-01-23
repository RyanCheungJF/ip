package duke.task;

import java.util.LinkedList;

/**
 * A container to store all the tasks that have been created.
 */
public class Tasklist {

    private LinkedList<Task> tasks;

    /**
     * Creates the container. Only allows events, deadlines and todos.
     */
    public Tasklist() {
        this.tasks = new LinkedList<Task>();
    }

    /**
     * Adds a task to the container to be tracked.
     *
     * @param t Task to be added.
     */
    public void addTask(Task t) {
        this.tasks.add(t);
    }

    /**
     * Gets the task specified.
     *
     * @param index Position of the task in the container.
     * @return Task matching the index.
     */
    public Task getTask(int index) {
        return this.tasks.get(index);
    }

    /**
     * Gets the total number of tasks inside the container.
     *
     * @return A number representing the total number of tasks.
     */
    public int getTotalTasks() {
        return this.tasks.size();
    }

    /**
     * Gets the task to be marked.
     *
     * @param index Position of the task in the container.
     * @return Task matching the index.
     */
    public Task mark(int index) {
        Task t = this.tasks.get(index);
        t.mark();
        return t;
    }

    /**
     * Gets the task to be unmarked.
     *
     * @param index Position of the task in the container.
     * @return Task matching the index.
     */
    public Task unmark(int index) {
        Task t = this.tasks.get(index);
        t.unmark();
        return t;
    }

    /**
     * Gets the task to be deleted.
     *
     * @param index Position of the task in the container.
     * @return Task matching the index.
     */
    public Task delete(int index) {
        return this.tasks.remove(index);
    }

    /**
     * Writes the tasks in a readable form.
     *
     * @return A string representing all the details of the tasks.
     */
    @Override
    public String toString() {
        StringBuilder allTasks = new StringBuilder("Fetching all records...\n");
        if (this.tasks.size() == 0) {
            return allTasks.append("No entries found, start by adding one!\n").toString();
        }
        for (int i = 0; i < this.tasks.size(); i++) {
            allTasks.append(i + 1)
                    .append(". ")
                    .append(this.tasks.get(i).toString())
                    .append("\n");
        }
        return allTasks.toString();
    }
}