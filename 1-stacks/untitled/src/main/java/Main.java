import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // *****************************************************

        // stack = LIFO data structure. Last-In First-Out
        //        stores objects into a sort of "vertical tower"
        //		  push() to add objects to the top
        //		  pop() to remove objects from the top
        //        peek() take a look at the obj on top of stack without removing it
        //        search(item) returns index of that obj in the stack

        // uses of stacks?
        // 1. undo/redo features in text editors
        // 2. moving back/forward through browser history
        // 3. backtracking algorithms (maze, file directories)
        // 4. calling functions (call stack)

        // *****************************************************

        Stack<String> stack = new Stack<String>();

        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("DOOM");
        stack.push("BorderLands");
        stack.push("NFS");

        String popped = stack.pop();

        System.out.println(stack.empty());
        System.out.println(stack);
        System.out.println("Popped: "+popped);

    }
}
