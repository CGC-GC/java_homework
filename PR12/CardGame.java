package PR12;

import java.util.*;

public class CardGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите структуру данных для организации хранения:");
        System.out.println("1. Stack");
        System.out.println("2. Queue");
        System.out.println("3. Deque");
        System.out.println("4. DoubleList");
        System.out.print("Ваш выбор: ");

        int choice = scanner.nextInt();
        scanner.nextLine(); // Очистка буфера после ввода числа

        // Создание коллекций в зависимости от выбора пользователя
        Collection<Integer> firstPlayerDeck = null;
        Collection<Integer> secondPlayerDeck = null;

        switch (choice) {
            case 1: // Stack
                firstPlayerDeck = new Stack<>();
                secondPlayerDeck = new Stack<>();
                break;
            case 2: // Queue
                firstPlayerDeck = new LinkedList<>();
                secondPlayerDeck = new LinkedList<>();
                break;
            case 3: // Deque
                firstPlayerDeck = new LinkedList<>();
                secondPlayerDeck = new LinkedList<>();
                break;
            case 4: // DoubleList
                firstPlayerDeck = new LinkedList<>();
                secondPlayerDeck = new LinkedList<>();
                break;
            default:
                System.out.println("Некорректный выбор.");
                return;
        }

        // Определение числа карт
        System.out.println("Введите количество карт для каждого игрока:");
        int numCards = scanner.nextInt();
        scanner.nextLine(); // Очистка буфера

        // Поочередный ввод карт для обоих игроков
        for (int i = 0; i < numCards; i++) {
            System.out.print("Игрок 1 - ");
            int firstCard = scanner.nextInt();
            addCardToDeck(firstPlayerDeck, firstCard, choice);
            
            System.out.print("Игрок 2 - ");
            int secondCard = scanner.nextInt();
            addCardToDeck(secondPlayerDeck, secondCard, choice);
        }

        int moves = 0;
        final int MAX_MOVES = 106;

        while (!firstPlayerDeck.isEmpty() && !secondPlayerDeck.isEmpty() && moves < MAX_MOVES) {
            moves++;
            
            // Получение верхних карт
            int firstCard = getTopCard(firstPlayerDeck, choice);
            int secondCard = getTopCard(secondPlayerDeck, choice);
            
            // Определение победителя хода
            if ((firstCard > secondCard && !(firstCard == 9 && secondCard == 0)) || 
                (firstCard == 0 && secondCard == 9)) {
                // Первый игрок выигрывает ход
                addCardsToBottom(firstPlayerDeck, secondCard, firstCard, choice);
            } else {
                // Второй игрок выигрывает ход
                addCardsToBottom(secondPlayerDeck, firstCard, secondCard, choice);
            }
            
            // Проверка окончания игры после каждого хода
            if (firstPlayerDeck.isEmpty()) {
                System.out.println("second " + moves);
                return;
            } else if (secondPlayerDeck.isEmpty()) {
                System.out.println("first " + moves);
                return;
            }
        }
        
        // Если достигнут лимит ходов
        if (moves >= MAX_MOVES) {
            System.out.println("botva");
        }
    }
    
    // Добавление карты в колоду в зависимости от структуры данных
    private static void addCardToDeck(Collection<Integer> deck, int card, int structureType) {
        switch (structureType) {
            case 1: // Stack
                ((Stack<Integer>) deck).push(card);
                break;
            case 2: // Queue
                ((Queue<Integer>) deck).add(card);
                break;
            case 3: // Deque
                ((Deque<Integer>) deck).add(card);
                break;
            case 4: // DoubleList
                ((LinkedList<Integer>) deck).add(card);
                break;
        }
    }
    
    // Получение верхней карты в зависимости от структуры данных
    private static int getTopCard(Collection<Integer> deck, int structureType) {
        int card = 0;
        
        switch (structureType) {
            case 1: // Stack
                card = ((Stack<Integer>) deck).pop();
                break;
            case 2: // Queue
                card = ((Queue<Integer>) deck).poll();
                break;
            case 3: // Deque
                card = ((Deque<Integer>) deck).pollFirst();
                break;
            case 4: // DoubleList
                card = ((LinkedList<Integer>) deck).pollFirst();
                break;
        }
        
        return card;
    }
    
    // Добавление карт вниз колоды в зависимости от структуры данных
    private static void addCardsToBottom(Collection<Integer> deck, int loserCard, int winnerCard, int structureType) {
        switch (structureType) {
            case 1: // Stack
                ((Stack<Integer>) deck).insertElementAt(winnerCard, 0);
                ((Stack<Integer>) deck).insertElementAt(loserCard, 0);
                break;
            case 2: // Queue
                ((Queue<Integer>) deck).add(loserCard);
                ((Queue<Integer>) deck).add(winnerCard);
                break;
            case 3: // Deque
                ((Deque<Integer>) deck).addLast(loserCard);
                ((Deque<Integer>) deck).addLast(winnerCard);
                break;
            case 4: // DoubleList
                ((LinkedList<Integer>) deck).addLast(loserCard);
                ((LinkedList<Integer>) deck).addLast(winnerCard);
                break;
        }
    }
}
