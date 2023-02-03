using RuTracker.Client.Model.SearchTopics.Request;
using RuTracker.Client;
using RuTracker.Client.Model.Exceptions;

var client = new RuTrackerClient();



// запрос логина/пароля
Console.OutputEncoding = System.Text.Encoding.UTF8;

Console.Write("Введите логин: ");
string Loggin = Console.ReadLine();
while (string.IsNullOrEmpty(Loggin))
{
    Console.WriteLine("Вы ввели пустую строку");
}
Console.Write("Введите пароль: ");
string password = Console.ReadLine();
//bool isOpen = true;
while (string.IsNullOrEmpty(password))
{
    Console.WriteLine("Вы ввели пустую строку");
}
try
{
    await client.Login(Loggin, password);
}
catch (RuTrackerClientAuthException exception)
{
   
    //isOpen= false;
}

Console.Write("Введите название запросса: ");
var searchString = Console.ReadLine() ?? "";
int resultCount = 0;

Console.Write("Введите колличесво результатов для отображения: ");
int.TryParse(Console.ReadLine(), out resultCount);

var res = await client.SearchTopics(new SearchTopicsRequest(
    Title: searchString,
    SortBy: SearchTopicsSortBy.Downloads,
    SortDirection: SearchTopicsSortDirection.Descending
));
var topic = res.Topics.Take(resultCount);
var counter = 1;
foreach (var topic2 in topic)
{
    Console.WriteLine($"{counter++}. {topic2.Title} ");
}
Console.Write("Введите номер результата для загрузки: ");

int.TryParse(Console.ReadLine(), out var resultToDownload);
var add_file = topic.ElementAt(resultToDownload - 1);
Console.WriteLine($"Вы хотите скачать : {topic.ElementAt(resultToDownload - 1).Title}");
Console.ReadLine();

var newFile = File.Create($"{add_file.Title[..20].Replace(".", " ").Trim()}.torrent");
var torrentFileBytes = await client.GetTopicTorrentFile(topic.ToArray()[resultToDownload - 1].Id);
await newFile.WriteAsync(torrentFileBytes);

newFile.Close();

Console.ReadLine();
