package StructuralDesignPattern.adapter;

public class JsonToXmlAdapter implements IAdapter<JSON> {
    private JSON json;

    public JsonToXmlAdapter(JSON json) {
        this.json = json;
    }

    @Override
    public XML convert(JSON json) {
        return this.json.convertToXML();
    }
}
