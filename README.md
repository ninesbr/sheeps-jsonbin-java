# Sheeps jsonbin java cli
```
    public static void main(String[] args) throws IOException {

        var resource = new ResourceImpl<>(Message.class, new ResourceSettings(
                "localhost",
                50082,
                "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJqdGkiOiI2MmZhZjUyNjhmYjNhMWMwMTUzZWIyNWQifQ.tQrQAgwW7R50cJ1EbLbBaSknkeBGp_DQNV3cAGQKuHQ",
                true,
                new GsonEngine()
        ));

        var msg = resource.getDocument("658d9a0d-bab9-4173-b813-6849222f529a");

        System.out.println( msg );

        resource.close();
    }

    resource.pushDocuments(new Message(
            UUID.randomUUID(),
            "test",
            "test",
            true,
            new UUID[] { UUID.randomUUID() },
            "test",
            new WeakHashMap<>(),
            null
    ));
```