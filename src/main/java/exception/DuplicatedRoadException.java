package exception;

import entity.Road;

public class DuplicatedRoadException extends RuntimeException {

    public DuplicatedRoadException() {
        super("Duplicate road adding attempt");
    }
}
