package by.epam.training_center.part2;

import by.epam.training_center.part2.beans.task1.Text;

/**
 * Aggregation and composition
 */
public final class Task1 {
    public static Text solution() {
        return new Text(TITLE, TEXT);
    }

    private static final String TITLE = "Lorem100";
    private static final String TEXT = "Lorem ipsum dolor sit amet consectetur adipisicing elit. " +
            "Praesentium asperiores enim facere modi culpa, officia itaque maiores nobis placeat, totam similique! " +
            "Reprehenderit recusandae nisi dolor tenetur velit eveniet molestias molestiae optio! " +
            "Quos libero, amet, nostrum possimus quod ipsa voluptas doloremque aut repellat debitis fugiat, quae tempore facere. " +
            "Error et fuga possimus inventore dicta earum placeat sed fugiat repellat saepe? " +
            "Perferendis repellat provident, eos perspiciatis itaque explicabo reiciendis earum modi aliquam inventore, possimus vitae est illum corrupti. " +
            "Corporis aliquid minus adipisci voluptate suscipit perspiciatis. " +
            "Ab debitis reiciendis asperiores nam fugiat illum ex eaque commodi quam? " +
            "Ea omnis tempore quis fuga obcaecati?";
}
