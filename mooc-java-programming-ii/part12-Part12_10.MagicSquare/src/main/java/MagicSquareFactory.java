public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {
        MagicSquare square = new MagicSquare(size);

        if (size % 2 == 0) {
            // even-size magic squares need different algorithms
            return square;
        }

        int row = 0;
        int col = size / 2;
        int value = 1;
        int total = size * size;

        while (value <= total) {
            square.placeValue(col, row, value);

            int nextRow = row - 1;
            int nextCol = col + 1;

            // wrap around top
            if (nextRow < 0) {
                nextRow = size - 1;
            }
            // wrap around right edge
            if (nextCol == size) {
                nextCol = 0;
            }

            // if next cell is already filled
            if (square.readValue(nextCol, nextRow) != 0) {
                // move down instead
                row = row + 1;
                // if past bottom edge
                if (row == size) {
                    row = 0;
                }
            } else {
                row = nextRow;
                col = nextCol;
            }

            value++;
        }

        return square;
    }
}
