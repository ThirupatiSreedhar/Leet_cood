class MinStack {
    Stack<Integer> s = new Stack<>();
    Stack<Integer> ms = new Stack<>();

    public MinStack() {

    }

    public void push(int value) {
        s.push(value);

        if (ms.isEmpty() || value <= ms.peek()) {
            ms.push(value);
        }
    }

    public void pop() {
        if (s.peek().equals(ms.peek())) {
            ms.pop();
        }

        s.pop();
    }

    public int top() {
        return s.peek();
    }

    public int getMin() {
        return ms.peek();
    }
}