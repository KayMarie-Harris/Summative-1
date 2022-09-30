package com.company.Summative1HarrisKayla.models;

import java.util.Objects;

public class Definition
{
    private int id;
    private String word;
    private String definition;

    public Definition(String word, String definition, int id)
    {
        this.id = id;
        this.word = word;
        this.definition = definition;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getWord()
    {
        return word;
    }

    public void setWord(String word)
    {
        this.word = word;
    }

    public String getDefinition()
    {
        return definition;
    }

    public void setDefinition(String definition)
    {
        this.definition = definition;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Definition word1 = (Definition) o;
        return id == word1.id && Objects.equals(word, word1.word) && Objects.equals(definition, word1.definition);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(id, word, definition);
    }

    @Override
    public String toString()
    {
        return "Word{" +
                "id=" + id +
                ", word='" + word + '\'' +
                ", definition='" + definition + '\'' +
                '}';
    }
}
