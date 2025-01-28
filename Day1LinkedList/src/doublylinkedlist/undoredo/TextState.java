package doublylinkedlist.undoredo;

class TextState {
    String textContent;
    TextState next;
    TextState prev;

    public TextState(String textContent) {
        this.textContent = textContent;
        this.next = null;
        this.prev = null;
    }
}