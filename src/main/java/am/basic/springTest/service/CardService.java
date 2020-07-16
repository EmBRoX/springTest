package am.basic.springTest.service;

import am.basic.springTest.model.Card;

import java.util.List;

public interface CardService {


    List<Card> getByUserId(int userId);

    void add(Card card);

    void delete(int id);

    List<Card> search(Card sample);
}