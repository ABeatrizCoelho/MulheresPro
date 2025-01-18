package com.mulherestech.mulherespro.service;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.mulherestech.mulherespro.model.Vaga;

@Component
public class DataLoader implements CommandLineRunner {
    private final VagaService vagaService;

    public DataLoader(VagaService vagaService) {
        this.vagaService = vagaService;
    }

    @Override
    public void run(String... args) throws Exception {
        vagaService.salvarVaga(new Vaga("Engenheira de Software Sênior",
                "Procuramos uma engenheira de software sênior para liderar nossa equipe de desenvolvimento. Valorizamos a diversidade e oferecemos um ambiente de trabalho inclusivo.",
                "São Paulo, SP", "TechWomen"));
        vagaService.salvarVaga(new Vaga("Analista de Dados",
                "Estamos em busca de uma analista de dados apaixonada por transformar informações em insights. Oferecemos mentoria e programas de desenvolvimento de carreira para mulheres.",
                "Rio de Janeiro, RJ", "DataDivas"));
        vagaService.salvarVaga(new Vaga("UX Designer",
                "Procuramos uma UX Designer criativa para projetar interfaces inclusivas e acessíveis. Ambiente de trabalho flexível e apoio à maternidade.",
                "Belo Horizonte, MG", "InclusiveTech"));
        vagaService.salvarVaga(new Vaga("Gerente de Projetos de TI",
                "Oportunidade para uma gerente de projetos experiente liderar iniciativas inovadoras. Oferecemos programas de liderança para mulheres e equilíbrio entre trabalho e vida pessoal.",
                "Porto Alegre, RS", "WomenLead"));
        vagaService.salvarVaga(new Vaga("Desenvolvedora Frontend",
                "Buscamos uma desenvolvedora frontend apaixonada por criar interfaces intuitivas e responsivas. Ambiente de trabalho remoto e flexível, ideal para mães que trabalham.",
                "Recife, PE", "CodeQueens"));
        vagaService.salvarVaga(new Vaga("Cientista de Dados",
                "Estamos contratando cientistas de dados para trabalhar em grandes volumes de dados e criar soluções inovadoras.",
                "Curitiba, PR", "DataInsights"));
        vagaService.salvarVaga(new Vaga("Engenheira de DevOps",
                "Oportunidade para Engenheira de DevOps trabalhar em automação de infraestrutura e pipelines de CI/CD.",
                "Florianópolis, SC", "CloudMakers"));
        vagaService.salvarVaga(new Vaga("Desenvolvedora Fullstack",
                "Buscamos uma desenvolvedora fullstack para desenvolver aplicações escaláveis e de alta performance.",
                "São Paulo, SP", "TechSpark"));
        vagaService.salvarVaga(new Vaga("Analista de Sistemas",
                "Procuramos um analista de sistemas com experiência em ERP e gestão de processos empresariais.",
                "Porto Alegre, RS", "BusinessSoft"));
        vagaService.salvarVaga(new Vaga("Engenheira de Qualidade de Software",
                "Responsável por garantir a qualidade do software através de testes automatizados e revisões de código.",
                "Belo Horizonte, MG", "QualityFirst"));
        vagaService.salvarVaga(new Vaga("Especialista em Segurança da Informação",
                "Estamos em busca de um especialista para implementar políticas de segurança e proteger nossos sistemas.",
                "Rio de Janeiro, RJ", "SecureTech"));
        vagaService.salvarVaga(new Vaga("Arquiteta de Soluções",
                "Buscamos arquiteta de soluções para liderar projetos estratégicos e arquitetar soluções tecnológicas robustas.",
                "Curitiba, PR", "Innovatech"));
        vagaService.salvarVaga(new Vaga("Desenvolvedora Mobile",
                "Procuramos desenvolvedora com experiência em Flutter ou React Native para criar aplicativos inovadores.",
                "Salvador, BA", "AppMakers"));
        vagaService.salvarVaga(new Vaga("Product Owner",
                "Buscamos um Product Owner para gerenciar o backlog e priorizar tarefas de desenvolvimento.",
                "Fortaleza, CE", "AgileTeam"));
        vagaService.salvarVaga(new Vaga("Coordenadora de TI",
                "Oportunidade para coordenadora de TI liderar equipe de suporte técnico e gestão de infraestrutura.",
                "São Paulo, SP", "InfraTech"));
        vagaService.salvarVaga(new Vaga("Desenvolvedora Backend",
                "Estamos em busca de uma desenvolvedora backend experiente em Java e Spring Boot.", "Recife, PE",
                "Backenders"));
        vagaService.salvarVaga(new Vaga("Scrum Master",
                "Procuramos Scrum Master para facilitar cerimônias ágeis e promover boas práticas de desenvolvimento.",
                "Porto Alegre, RS", "AgileCo"));
        vagaService.salvarVaga(new Vaga("Especialista em Machine Learning",
                "Buscamos especialista em Machine Learning para criar modelos preditivos de última geração.",
                "Campinas, SP", "MLExperts"));
        vagaService.salvarVaga(new Vaga("Engenheira de Redes",
                "Procuramos engenheira de redes para gerenciar a infraestrutura de rede e a conectividade.",
                "Brasília, DF", "NetConnect"));
        vagaService.salvarVaga(new Vaga("Desenvolvedora de Jogos",
                "Estamos em busca de uma desenvolvedora de jogos para criar experiências interativas e envolventes.",
                "Rio de Janeiro, RJ", "GameCreators"));
        vagaService.salvarVaga(new Vaga("Consultora de TI",
                "Procuramos consultora para avaliar e implementar soluções tecnológicas sob medida para nossos clientes.",
                "Curitiba, PR", "ConsultingTech"));
        vagaService.salvarVaga(new Vaga("Analista de Infraestrutura",
                "Responsável por gerenciar e monitorar servidores e sistemas operacionais.", "Florianópolis, SC",
                "InfraMasters"));
        vagaService.salvarVaga(new Vaga("Testadora de Software",
                "Oportunidade para testadora de software realizar testes manuais e automatizados em novos sistemas.",
                "Salvador, BA", "QualityCheck"));
        vagaService.salvarVaga(new Vaga("Analista de Suporte Técnico",
                "Buscamos analista para fornecer suporte técnico e solucionar problemas de hardware e software.",
                "Fortaleza, CE", "TechSupport"));
        vagaService.salvarVaga(new Vaga("Gestora de TI",
                "Estamos contratando uma gestora de TI para liderar projetos e supervisionar equipes técnicas.",
                "São Paulo, SP", "LeadIT"));
        vagaService.salvarVaga(new Vaga("Engenheira de Software Pleno",
                "Buscamos engenheira de software pleno para trabalhar em sistemas críticos e escaláveis.",
                "Porto Alegre, RS", "CodeWorks"));
        vagaService.salvarVaga(new Vaga("Programadora Python",
                "Oportunidade para programadora Python desenvolver sistemas robustos e scripts de automação.",
                "Rio de Janeiro, RJ", "PyTech"));
        vagaService.salvarVaga(new Vaga("Arquiteta de Dados",
                "Procuramos arquiteta de dados para modelar e organizar grandes volumes de informações.",
                "Campinas, SP", "DataArchitects"));
        vagaService.salvarVaga(new Vaga("Analista de Cloud",
                "Buscamos analista para gerenciar ambientes em nuvem e implementar soluções AWS.", "Belo Horizonte, MG",
                "CloudFirst"));
        vagaService.salvarVaga(new Vaga("Especialista em Big Data",
                "Estamos em busca de especialista para trabalhar com grandes volumes de dados e plataformas Hadoop.",
                "Curitiba, PR", "BigDataTech"));

    }
}
