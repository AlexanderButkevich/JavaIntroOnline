package regexs.beans;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * XML file content node
 */
public class Node {

    /**
     * node type
     */
    private final NodeType type;

    /**
     * node value: name(tag), value(content)
     */
    private final String value;

    /**
     * parameters map: name=value
     */
    private Map<String, String> parameters;

    /**
     * new node constructor
     * @param type sets type
     * @param value sets value
     * @param parameters - names, values as a string
     */
    public Node(NodeType type, String value, String parameters) {
        this.type = type;
        this.value = value;
        setParameters(parameters);
    }

    /**
     * parameters map parser
     * @param str input string
     */
    private void setParameters(String str) {
        parameters = new HashMap<>();
        if (Objects.isNull(str)) return;

        Pattern pattern = Pattern.compile(PARAMETER_REGEX);
        Matcher matcher = pattern.matcher(str);

        while (matcher.find()) {
            parameters.put(matcher.group(1), matcher.group(2));
        }
    }

    /**
     * @return nodes type
     */
    public NodeType getType() {
        return type;
    }

    /**
     * @return nodes value
     */
    public String getValue() {
        return value;
    }

    /**
     * @return parameters map
     */
    public Map<String, String> getParameters() {
        return parameters;
    }

    @Override
    public String toString() {
        return "Node{" +
                "type=" + type +
                ", value='" + value + '\'' +
                ", parameters=" + parameters +
                '}';
    }

    /**
     * regex to parse parameters map
     */
    private static final String PARAMETER_REGEX = " (\\w+) *= *\"([^\"]*)\"";

    /**
     * node type enum
     */
    public enum NodeType {
        OPENING_TAG, CLOSING_TAG, BODILESS_TAG, CONTENT
    }
}
