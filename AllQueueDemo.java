package com.anu;

import java.util.*;

public class AllQueueDemo {

    public static void main(String[] args) {
        System.out.println("1. Queue sort of [5, 2, 8]");
        sortUsingQueue();

        System.out.println("\n\n2. Play the most fun game first:");
        playMostFunGame();

        System.out.println("\n\n3. To-do list with priority:");
        todoList();

        System.out.println("\n\n4. Find top 2 smallest numbers:");
        topTwoSmallest();

        System.out.println("\n\n5. Cartoon-style task queue:");
        cartoonTaskQueue();
    }

    public static void sortUsingQueue() {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(5);
        queue.add(2);
        queue.add(8);

        while (!queue.isEmpty()) {
            System.out.print(queue.poll() + " ");
        }
    }

    // 2. Create a list of games and play the most fun one first
    public static void playMostFunGame() {
        class Game {
            String name;
            int funLevel;
            Game(String name, int funLevel) {
                this.name = name;
                this.funLevel = funLevel;
            }
        }

        PriorityQueue<Game> games = new PriorityQueue<>((a, b) -> b.funLevel - a.funLevel);
        games.add(new Game("Chess", 5));
        games.add(new Game("Mario", 9));
        games.add(new Game("Puzzle", 7));

        Game mostFun = games.poll();
        System.out.println("Play: " + mostFun.name + " (Fun level: " + mostFun.funLevel + ")");
    }

   
    public static void todoList() {
        class Task {
            String name;
            int priority;
            Task(String name, int priority) {
                this.name = name;
                this.priority = priority;
            }
        }

        PriorityQueue<Task> todo = new PriorityQueue<>((a, b) -> a.priority - b.priority);
        todo.add(new Task("Finish report", 1));
        todo.add(new Task("Check emails", 3));
        todo.add(new Task("Prepare for meeting", 2));

        while (!todo.isEmpty()) {
            System.out.println("Do: " + todo.poll().name);
        }
    }

    
    public static void topTwoSmallest() {
        int[] arr = {7, 3, 9, 1, 6};
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int num : arr) {
            pq.add(num);
        }

        System.out.println("Smallest: " + pq.poll());
        System.out.println("2nd Smallest: " + pq.poll());
    }

    
    public static void cartoonTaskQueue() {
        Queue<String> tasks = new LinkedList<>();
        tasks.add("Eat 🍔");
        tasks.add("Sleep 😴");
        tasks.add("Code 👨‍💻");

        while (!tasks.isEmpty()) {
            System.out.println("Do task: " + tasks.poll());
        }
    }
}

