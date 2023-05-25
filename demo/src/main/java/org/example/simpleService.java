package org.example;
/**
@Service
public class simpleService {

    @Autowired
    private PeopleRepository peopleRepository;

    public List<People> getAllPeople(){
        return this.peopleRepository.findAll();
    }

    public People addPerson(People p){
        return this.peopleRepository.save(p);
    }

    public People updatePerson(People p){

    }

    public People deletePerson(People p){
        return this.peopleRepository.delete(p);
    }





}
 **/
