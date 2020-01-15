package hr.documents;

public class WorkContract implements
      ExportableJson,
      ExportableText,
      ExportablePdf {

    private String content;

    public WorkContract(String content) {
        this.content = content;
    }

    @Override
    public String toJson() {
        return "{'content':'" + this.content + "'}";
    }

    @Override
    public byte[] toPdf() {
        return this.content.getBytes();
    }

    @Override
    public String toTxt() {
        return this.content;
    }
}
