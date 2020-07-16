package am.basic.springTest.service.impl;

import am.basic.springTest.model.Card;
import am.basic.springTest.repository.CardRepository;
import am.basic.springTest.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardServiceImpl implements CardService {

    @Autowired
    private CardRepository cardRepository;

    @Override
    public List<Card> getByUserId(int userId){return cardRepository.getByUserId(userId);}

    @Override
    public void add(Card card){cardRepository.save(card);}

    @Override
    public void delete(int id){cardRepository.deleteById(id);}

    @Override
    public List<Card> search(Card sample){return cardRepository.findAll(Example.of(sample));}

}